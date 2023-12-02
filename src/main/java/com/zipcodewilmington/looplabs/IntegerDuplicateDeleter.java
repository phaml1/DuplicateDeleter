package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        int count = 0;
        for (Integer i : this.array){
            for (Integer integer: this.array){
                if(i.equals(integer)){
                    count++;
                }
            }
        }
        Integer[] temp = new Integer[array.length - count];
        int j = 0;
        if(count == maxNumberOfDuplications){
            for (Integer i : this.array){
                for (Integer integer: this.array){
                    if(!i.equals(integer)){
                        temp[j] = i;
                        j++;
                    }
                }
            }
        }
        return temp;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return new Integer[0];
    }
}
