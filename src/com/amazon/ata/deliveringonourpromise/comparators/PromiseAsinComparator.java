package com.amazon.ata.deliveringonourpromise.comparators;

import com.amazon.ata.deliveringonourpromise.types.Promise;

import java.util.Comparator;

public class PromiseAsinComparator implements Comparator<Promise> {


    @Override
    public int compare(Promise asin1, Promise asin2) {
        if (asin1.getAsin().equals(asin2.getAsin())) {
            return 0;
        } else {
            return asin1.getAsin().compareTo(asin2.getAsin());
        }

    }
}
