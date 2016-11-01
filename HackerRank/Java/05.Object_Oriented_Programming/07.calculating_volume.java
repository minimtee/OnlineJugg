/*

You are given a class Solution and its main method in the editor.
In each test cases, it takes an input ch which represents a choice of the following:

ch = 1 represents the volume of a cube that has to be calculated where a represents the length of the sides of the cube.

ch = 2 represents the volume of a cuboid that has to be calculated where l,b,h represent the dimensions of a cuboid.

ch = 3 represents the volume of a hemisphere that has to be calculated where r represents the radius of a hemisphere.

ch = 4 represents the volume of a cylinder that has to be calculated where r h represent the radius and height of the cylinder respectively.

Your task is to create the class Calculate and the required methods so that the code prints the volume of the figures rounded to exactly 3 decimal places.

*/

class Calculate{

    Scanner scan;
    Output output;

    Calculate(){
        scan = new Scanner(System.in);
        output = new Output();
    }

    public int get_int_val() throws IOException{
        int input = scan.nextInt();
        if(input <= 0){
            throw new NumberFormatException("All the values must be positive");
        }
        return input;

    }

    public double get_double_val(){
        double input = scan.nextDouble();
        if(input <= 0){
            throw new NumberFormatException("All the values must be positive");
        }
        return input;
    }

    // inner class
    public static Volume do_calc(){
        return new Volume();
    }
}


class Volume{
    public double get_volume(int a ){
        return a*a*a;
    }

    public double get_volume(int l ,int b ,int h){
        return l*b*h;
    }

    public double get_volume(double r){
        return (2 * Math.PI * r * r * r) / 3;
    }

    public double get_volume(double r ,double h){
        return Math.PI * (r * r) * h;
    }
}

class Output{
    void display(double num){
        System.out.println(String.format("%.3f",num));
    }
}