//Name: Osama Zaheer
//faculty No.: 20COB110


#include<iostream>
using namespace std;
// class Shape{
//     public:   //Access specifier
//     int h;
//   Shape(){
//       cout<<"Enter height of cuboid ";     //default constructor
//       cin>>h;
//   }
// };
// class rectangle{
//      public:
//      int l;
//      int b;
//     rectangle(){
//         cout<<"Enter length of cuboid ";
//         cin>>l;
//         cout<<"Enter breadth of cuboid ";
//         cin>>b;
//     }
// };
// class cuboid:public Shape,public rectangle{
   
//     public:
// void area(){
// cout<<"Suface area of Cuboid is: 2*"<<l<<"*"<<b<<" + 2*"<<b<<"*"<<h<<" + 2*"<<h<<"*"<<l<<" = "<<2*l*b+2*b*h+2*h*l<<endl;
// }
// void volume(){
//  cout<<"Volume of cuboid is : "<<l<<"*"<<b<<"*"<<h<<" = "<<l*b*h<<endl;
// }
// };
// int main(){
//    cuboid r;
//    r.area();
//    r.volume();
 
// }
void ass(int &,int);
int main(){
  int o =0;
  int in=5;
  ass(o,in);
  cout<<o<<endl;
}
int ass(int& myo,int myin){
  myo*=myin;
  return;
  
  
}