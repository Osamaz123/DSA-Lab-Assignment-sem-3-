//Name: Osama Zaheer
//faculty No.: 20COB110
//S.No: 11

#include <iostream>
#define PI 3.14
using namespace std;

class shp{
    public:
    float l,b;
    public:
 virtual void area(){
    cout<<" Function to calculate area of the shp is ";
}
virtual void perimeter(){
    cout<<"Function to calculate perimeter of the shp ";
}

};
class rectangle:public shp{
    public:
    rectangle(){
        cout<<"Enter length of rectangle ";
        cin>>l;
        cout<<"Enter breadth of rectangle ";
        cin>>b;
    }
void area(){
    cout<<"Area of rectangle is: "<<l*b<<endl;
}
void perimeter(){
    cout<<"Perimeter of rectangle is: "<<2*l+2*b<<endl;
}

};
class square:public shp{
    public:
    square(){
        cout<<"Enter the side of square: ";
        cin>>l;
    }
    void area(){
        cout<<"Area of square is: "<<l*l<<endl;
    }
    void perimeter(){
        cout<<"Perimeter of Square is: "<<4*l<<endl;
    }

};
class triangle:public shp{
    private:
    float a,c;
    public:
    triangle(){
        cout<<"Enter the base of trinagle: ";
        cin>>b;
        cout<<"Enter the height of triangle: ";
        cin>>l;
        
    }
    void area(){
        cout<<"Area of triangle is: "<<b*l/2<<endl;
    }
    void perimeter(){
        cout<<"Enter the other two sides of triangle: ";
        cin>>a>>c;
        if(a+b<=c||b+c<=a||c+a<=b){
            cout<<"Triangle is not possible with the given dimensions\n";
        }else
        cout<<"\nPerimeter of triangle is: "<<a+b+c<<endl;
    }

};
class circle: public shp{
private:
float r;
public:
circle(){
    cout<<"Enter the radius of circle: ";
    cin>>r;
}
void area(){
    cout<<"Area of circle is: "<<PI*r*r;
}
void perimeter(){
    cout<<"\nPerimeter of circle is : "<<2*PI*r;
}
};
int main(){
    
shp *sh;      //Pointer of base type 

rectangle r;
sh= &r;                    //Base type pointer points to derived class(rectangle)
sh->area();                // Calls member function of derived class
sh->perimeter();
cout<<"---------------------------------------------\n\n";
square s;
sh =&s;
sh->area();
sh->perimeter();
cout<<"---------------------------------------------\n\n";
triangle t;
sh = &t;
sh->area();
sh->perimeter();
cout<<"---------------------------------------------\n\n";
circle C;
sh = &C;
sh->area();
sh->perimeter();
return 0;
}