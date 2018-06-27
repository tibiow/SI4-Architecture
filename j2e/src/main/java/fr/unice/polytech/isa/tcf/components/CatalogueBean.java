package fr.unice.polytech.isa.tcf.components;

import fr.unice.polytech.isa.tcf.CatalogueExploration;
import fr.unice.polytech.isa.tcf.entities.Item;

import javax.ejb.Stateless;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import java.util.Optional;

import javax.persistence.NoResultException;


@Stateless(name = "catalogue-stateless")
public class CatalogueBean implements CatalogueExploration {

	@PersistenceContext private EntityManager manager;

	public void add(Item item) {
		manager.persist(item);
	}

	public void remove(Item item) {
		manager.remove(item);
	}

	@Override
	public Optional<List<Item>> listPreMadeItems(boolean vup) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Item> criteria = builder.createQuery(Item.class);
		Root<Item> root =  criteria.from(Item.class);
		if(!vup) {
			criteria.select(root).where(builder.equal(root.get("offer").get("VUP"), false));
		} else {
			criteria.select(root);
		}
		TypedQuery<Item> query = manager.createQuery(criteria);
		try {
			return Optional.of(query.getResultList());
		} catch (NoResultException nre){
			return Optional.empty();
		}
	}

	@Override
	public Optional<Item> exploreCatalogue(Item i) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Item> criteria = builder.createQuery(Item.class);
		Root<Item> root =  criteria.from(Item.class);
		criteria.select(root).where(builder.equal(root.get("offer").get("name"),i.getOffer().getName()),
                builder.equal(root.get("offer").get("description"),i.getOffer().getDescription()),
                builder.equal(root.get("offer").get("image"),i.getOffer().getImage()),
                builder.equal(root.get("offer").get("VUP"),i.getOffer().isVUP()),
                builder.equal(root.get("offer").get("gift"),i.getOffer().isGift()),
                builder.equal(root.get("offer").get("price"),i.getOffer().getPrice()),
                builder.equal(root.get("offer").get("points"),i.getOffer().getPoints()));
		TypedQuery<Item> query = manager.createQuery(criteria);
		try {
			return Optional.of(query.getSingleResult());
		} catch (NoResultException nre){
			return Optional.empty();
		}
	}

	@Override
	public Optional<Item> exploreCatalogue(int id) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Item> criteria = builder.createQuery(Item.class);
		Root<Item> root =  criteria.from(Item.class);
		criteria.select(root).where(builder.equal(root.get("id"), id));
		TypedQuery<Item> query = manager.createQuery(criteria);
		try {
			return Optional.of(query.getSingleResult());
		} catch (NoResultException nre){
			return Optional.empty();
		}
	}
}
