package fr.unice.polytech.isa.tcf.entities;

import java.util.Optional;

public enum AdvantageStatus {

	EN_ATTENT, EN_COURS, TERMINE;

    public static Optional<AdvantageStatus> next(AdvantageStatus status) {
        Optional<AdvantageStatus> result = Optional.empty();
        switch (status) {
            case EN_ATTENT:
                result = Optional.of(EN_COURS);
                break;
            case EN_COURS:
                result = Optional.of(TERMINE);
                break;
            default:
        }
        return result;
    }

}
