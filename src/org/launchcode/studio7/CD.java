package org.launchcode.studio7;

public class CD extends BaseDisc{
    public static final String defaultSpinningRate = "500 rpm";
    public static final String defaultReadingSpeed = "3MB/s";

    public CD(String name, int storageCapacity, String contents, String discType){
        super (name, storageCapacity, contents, discType);
        setReadingSpeed(defaultReadingSpeed);
        setSpinningRate(defaultSpinningRate);
    }

    @Override
    public void laserReadsData(){
        spinDisc();
        System.out.println("reading from " + getDiscType() + "@ " + getReadingSpeed());
    }

    @Override
    public void spinDisc(){
        System.out.println(getDiscType() + " spins at " + getSpinningRate());
    }

}
