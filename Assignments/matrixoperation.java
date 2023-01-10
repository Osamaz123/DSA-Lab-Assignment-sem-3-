//Name : Osama Zaheer
//Faculty No.: 20COB110
//Enrollment No.: GJ8966
class TwoDMatrix{
    int A[][] = { { 1, 6, 3 },
                  { 2, 5, 6 },
                  { 8, 7, 4 } };

    int B[][] = { { 1, 2, 2 },
                  { 2, 0, 3 },
                  { 3, 5, 4 } };
    int C[][] = new int[3][3];

    public void add(){
       
       for(int i=0;i<3;i++){
           for(int j=0; j<3;j++){
               C[i][j]= A[i][j]+ B[i][j];
               System.out.printf("%-4d",C[i][j] );
           }
           System.out.println();

}System.out.println();
    }
    public void subtract(){
        
        for(int i=0;i<3;i++){
            for(int j=0; j<3;j++){
                C[i][j]= A[i][j]- B[i][j];
                System.out.printf("%-4d",C[i][j] );
            }
            System.out.println(); 
 }
 System.out.println();
     }

     public void multiply(){
        for(int i=0;i<3;i++){
            for(int j=0; j<3;j++){
                for(int k =0;k<3;k++){
                    C[i][j]= C[i][j]+ A[i][k]*B[k][j];
                      
                }
                System.out.printf("%-4d",C[i][j] );
            }
            System.out.println(); 
 }
 System.out.println();
     }   
    }
class SparseMatrix{
    int p =0;
    int q=0;
    int r = 0;
    int SC[][] =new int[10][3];
    int SA[][] ={ {1,2,10},
                  {1,4,12},
                  {3,3,5},
                  {4,1,15},
                  {4,2,12}};
   int SB[][] ={ {1,3,8},
                 {2,4,23},
                 {3,3,9},
                 {4,1,20},
                 {4,2,25}};

public void sparseAdd(){ 
                 while( p<=4 && q<=4){
if(SA[p][0]==SB[q][0]){
if(SA[p][1]==SB[q][1]){
    SC[r][0]= SA[p][0];
    SC[r][1]= SA[p][1];
    SC[r][2]= SA[p][2]+SB[q][2];
    System.out.printf("%-5d%-5d%-5d\n",SC[r][0],SC[r][1],SC[r][2]);
    p++;
    q++;
    r++;
}
else{
    if(SA[p][1]<SB[q][1])
    {
        SC[r][0]= SA[p][0];
    SC[r][1]= SA[p][1];
    SC[r][2]= SA[p][2];
    System.out.printf("%-5d%-5d%-5d\n",SC[r][0],SC[r][1],SC[r][2]);
    p++;
    r++;
    }
    else{
           if(SA[p][1]>SB[q][1])
         {
            SC[r][0]= SB[q][0];
            SC[r][1]= SB[q][1];
            SC[r][2]= SB[q][2];
         System.out.printf("%-5d%-5d%-5d\n",SC[r][0],SC[r][1],SC[r][2]);
         q++;
         r++;
         }
         }
}
                 }
                 else{
                    if(SA[p][0]>SB[q][0]){
                        SC[r][0]= SB[q][0];
                        SC[r][1]= SB[q][1];
                        SC[r][2]= SB[q][2];
                       System.out.printf("%-5d%-5d%-5d\n",SC[r][0],SC[r][1],SC[r][2]);
                       q++;
                       r++;
                    }     
                    else
                    {
                        if(SA[p][0]<SB[q][0]){
                            SC[r][0]= SA[p][0];
                            SC[r][1]= SA[p][1];
                           SC[r][2]= SA[p][2];
                           System.out.printf("%-5d%-5d%-5d\n",SC[r][0],SC[r][1],SC[r][2]);
                           p++;
                           r++; 
                    }

                 }

                }   
}
}
public void sparseSub(){ 
    while( p<=4 && q<=4){
if(SA[p][0]==SB[q][0]){
if(SA[p][1]==SB[q][1]){
SC[r][0]= SA[p][0];
SC[r][1]= SA[p][1];
SC[r][2]= SA[p][2]-SB[q][2];
System.out.printf("%-5d%-5d%-5d\n",SC[r][0],SC[r][1],SC[r][2]);
p++;
q++;
r++;
}
else{
if(SA[p][1]<SB[q][1])
{
SC[r][0]= SA[p][0];
SC[r][1]= SA[p][1];
SC[r][2]= SA[p][2];
System.out.printf("%-5d%-5d%-5d\n",SC[r][0],SC[r][1],SC[r][2]);
p++;
r++;
}
else{
if(SA[p][1]>SB[q][1])
{
SC[r][0]= SB[q][0];
SC[r][1]= SB[q][1];
SC[r][2]= SB[q][2];
System.out.printf("%-5d%-5d%-5d\n",SC[r][0],SC[r][1],SC[r][2]);
q++;
r++;
}
}
}
    }
    else{
       if(SA[p][0]>SB[q][0]){
           SC[r][0]= SB[q][0];
           SC[r][1]= SB[q][1];
          SC[r][2]= SB[q][2];
          System.out.printf("%-5d%-5d%-5d\n",SC[r][0],SC[r][1],SC[r][2]);
          q++;
          r++;
       }     
       else
       {
           if(SA[p][0]<SB[q][0]){
               SC[r][0]= SA[p][0];
               SC[r][1]= SA[p][1];
              SC[r][2]= SA[p][2];
              System.out.printf("%-5d%-5d%-5d\n",SC[r][0],SC[r][1],SC[r][2]);
              p++;
              r++; 
       }

    }

   }   
}
}

public void sparseMultiply(){
    int tp[][] = new int[100][3];
    int  k=0;
    int p[][]= new int[100][3];
    //transpose of SB matrix
    for(int z =0 ;z<5;z++){
        for(int i =0 ;i<5;i++){
            if(SB[i][1]==z){
    tp[k][0]= SB[i][1];
    tp[k][1]= SB[i][0];
    tp[k][2]= SB[i][2];
   
    k++;
            }
        }
    
    }
    for(int i = 0; i<5;i++)
    {
        for(int j = 0; j<5;j++)
        {
            if(SA[i][1]==tp[j][1])
            {
                p[i][2]= SA[i][2]*tp[j][2];
                p[i][0]= SA[i][0];
                p[i][1]= tp[j][0];
                 System.out.printf("%-5d%-5d%-5d\n",p[i][0],p[i][1],p[i][2]);
                
            }
            
        }
    } 
    
}
}
public class matrixoperation {
    public static void main(String[] args) {
        TwoDMatrix m1 = new TwoDMatrix();
        System.out.println("Addition");
        m1.add();
        System.out.println("Subtraction");
        m1.subtract();
        System.out.println("Multiplication");
        m1.multiply();
        SparseMatrix s1 = new SparseMatrix();
        SparseMatrix s2 = new SparseMatrix();
        System.out.println("Sparse addition");
        System.out.println("Row  Col  Value");
        s1.sparseAdd();
        System.out.println("Sparse subtraction");
        System.out.println("Row  Col  Value");
        s2.sparseSub();
        System.out.println("Sparse Multiply");
        System.out.println("Row  Col  Value");
        s2.sparseMultiply();

    }
}
