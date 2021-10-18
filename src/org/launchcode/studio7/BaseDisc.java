package org.launchcode.studio7;

public abstract class BaseDisc implements OpticalDisc{
    private int storageCapacity;
    private String name;
    private String contents;
    private String discType;
    private String spinningRate;
    private String readingSpeed;

    public BaseDisc(String name, int storageCapacity, String contents, String discType) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.contents = contents;
        this.discType = discType;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity){
        this.storageCapacity = storageCapacity;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public String getSpinningRate() {
        return spinningRate;
    }

    public void setSpinningRate(String spinningRate) {
        this.spinningRate = spinningRate;
    }

    public String getReadingSpeed() {
        return readingSpeed;
    }

    public void setReadingSpeed(String readingSpeed) {
        this.readingSpeed = readingSpeed;
    }

    protected void laserWritesData(){
        spinDisc();
        System.out.println("writing on Disc Type: " + discType + " | Storage Capacity: " + storageCapacity + "MB.");
    }

    protected void laserReadsData(){
        spinDisc();
        System.out.println("reading on Disc Type: " + discType + " | Storage Capacity: " + storageCapacity + "MB.");
    }







}
