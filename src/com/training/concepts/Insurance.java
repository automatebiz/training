package com.training.concepts;

import java.util.Date;

public class Insurance implements Comparable<Insurance> {
    private String uniqueId;
    private String vendor;
    private int insurancePremium;
    private int insuredAmount;
    private Date startDate;
    private Date endDate;

    @Override
    public int compareTo(Insurance o) {
        return uniqueId.compareTo(o.uniqueId);
    }
}
