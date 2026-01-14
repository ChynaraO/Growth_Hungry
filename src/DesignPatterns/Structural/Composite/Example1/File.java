package DesignPatterns.Structural.Composite.Example1;
//leaf
class File implements FileSystemItem{
    private String name;
    File(String name){
        this.name = name;
    }

    @Override
    public void showDetail() {
            System.out.println("File: " + name);

    }
}
