package org.launchcode.studio7;

public class DVD extends BaseDisc{
    public static final String defaultSpinningRate = "1600 rpm";
    public static final String defaultReadingSpeed = "3MB/s";

    public DVD(String name, int storageCapacity, String contents, String discType){
        super(name, storageCapacity, contents, discType);
        setReadingSpeed(defaultReadingSpeed);
        setSpinningRate(defaultSpinningRate);
    }

    @Override
    public void laserReadsData(){
        spinDisc();
        System.out.println("reading from disc type: " + getDiscType() + " @ " + getReadingSpeed());
    }

    @Override
    public void spinDisc(){
        System.out.println(getDiscType() + " spins at " + getSpinningRate());
    }

}
