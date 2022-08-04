class Shape{ 
    int a;
    Shape(int x){
        a=x;
    }   
    void draw(){
        System.out.println("A shape created");
    }
    void erase(){
        System.out.println("shape erased");
        
    }
}
class Circle extends Shape{
    Circle(int x){
        super(x);
    }
    
    void draw(){
        System.out.println("circle with radius ="+a);
    }
    void erase(){
        System.out.println("circle erased");
        System.out.println();
    }
}
class Square extends Shape{
    Square(int x){
        super(x);
    }
    void draw(){
        System.out.println("Square with side ="+a);
    }
    void erase(){
        System.out.println("Square erased");
        System.out.println();
    }
}
class Triangle extends Shape{
    Triangle(int x){
        super(x);
    }
    void draw(){
        System.out.println("Eqi Triangle with side ="+a);
    }
    void erase(){
        System.out.println("Triangle erased");
        System.out.println();
    }
}
class Main{
    public static void main(String args[]){
        Shape s =new Shape(3);
        Circle c = new Circle(5);
        Square sq =new Square(4);
        Triangle t= new Triangle(6);
        s.draw(); 
        s.erase();
        c.draw();
        c.erase();
        s.draw(); 
        s.erase();
        sq.draw();
        sq.erase();
        s.draw(); 
        s.erase();
        t.draw(); 
        t.erase();

    }
}