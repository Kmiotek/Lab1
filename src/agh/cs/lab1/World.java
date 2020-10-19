package agh.cs.lab1;

import javax.xml.transform.sax.SAXSource;

public class World {

    public static void main(String[] args) {
        System.out.println("System rozpoczął pracę:");

        Direction dir[] = translator(args);

        World.run(dir);
        System.out.println("System zakończył pracę:");
    }

    public static Direction[] translator(String[] args){
        Direction dir[] = new Direction[args.length];

        int i =0;

        for(String str : args){
            if(str.equals("f")){
                dir[i] = Direction.FORWARD;
            } else if(str.equals("r")){
                dir[i] = Direction.RIGHT;
            } else if(str.equals("l")){
                dir[i] = Direction.LEFT;
            } else if(str.equals("b")){
                dir[i] = Direction.BACKWARD;
            }
            i++;
        }
        return dir;
    }

    public static void run(Direction[] tab){
        System.out.println("Zwierzak pędzi");
        for (Direction str : tab) {
            System.out.print("Zwierzak idzie do ");
            if(str.equals(Direction.FORWARD)){
                System.out.println("przodu");
            } else if(str.equals(Direction.BACKWARD)){
                System.out.println("tyłu");
            } else if(str.equals(Direction.RIGHT)){
                System.out.println("prawo");
            } else if(str.equals(Direction.LEFT)){
                System.out.println("lewo");
            } else {
                System.out.println("góry?");
            }
        }
        System.out.println("Zwierzak stoi");
    }
}

