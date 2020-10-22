import java.util.Scanner;
 class Employee {

   private String name;
   private String id;
    
   public Employee(String name, String id){
       this.name=name;
       this.id=id;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
   public double earnings(){
       return 0.0;
   }
   public String toString(){
       return "Employee[name="+ name +" , id="+ id +"]";
   }
 
    public static class SalaryEmployee extends Employee{
        private double salary;
       public SalaryEmployee( String name, String id, double salary){
           super(name,id);
           this.salary=salary;
       }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
       public double earnings(){
           return salary;
       }
        @Override
    public String toString(){
        return "SalaryEmployee[Employee[name="+this.getName()+" , id="+this.getId()+",salary="+this.getSalary()+"]";
               
    }   
    }
    
  public static class CommissionEmployee extends Employee{
       private double commissionRate;
       private double sales;
       
       public CommissionEmployee( String name, String id, double commissionRate, double sales){
           super(name,id);
           this.commissionRate= commissionRate;
           this.sales= sales;
       }  

        public double getCommissionRate() {
            return commissionRate;
        }

        public void setCommissionRate(double commissionRate) {
            this.commissionRate = commissionRate;
        }

        public double getSales() {
            return sales;
        }

        public void setSales(double sales) {
            this.sales = sales;
        }
       public double earnings(){
           return this.commissionRate*sales;
       }
       @Override
       public String toString(){
           return "CommissionEmployee[Employee [name="+ this.getName()+", id="+ this.getId()+", commissionRate" + this.getCommissionRate()+" "+ "sales" +this.getSales() + "]";
       }
   }
     public static  class HourlyEmployee extends Employee{
     private double Totalhourworked;
     private double Perhourpay;
 
     public HourlyEmployee(String name, String id, double Totalhourworked, double Perhourpay){
         super(name,id);
         this.Totalhourworked= Totalhourworked;
         this.Perhourpay=Perhourpay;
     }

        public double getTotalhourworked() {
            return Totalhourworked;
        }

        public void setTotalhourworked(double Totalhourworked) {
            this.Totalhourworked = Totalhourworked;
        }

        public double getPerhourpay() {
            return Perhourpay;
        }

        public void setPerhourpay(double Perhourpay) {
            this.Perhourpay = Perhourpay;
        }
     public double earnings(){
         return this.Totalhourworked*this.Perhourpay;
     }
     @Override
     public String toString(){
         return "HourlyEmployee[Employee[name="+this.getName()+", id="+this.getId()+"],Totalhourworked"+ this.getTotalhourworked()+" " +"Perhourpay"+ this.getPerhourpay();
 }
      }






      public static  class employee{
        public static void main(String[] args) {
             Scanner input= new Scanner(System.in);
           Employee employee[]= new Employee[1];
           
           for(int i=0; i<employee.length;i++){
           
            System.out.println("Please Enter 0 for salary employee ,1 for commission employee, 2 for hourly employee" );
            int type= input.nextInt();
            input.nextLine();
           
            
            switch(type){
                
                case 0:
                     System.out.println("Enter name");
                     String name= input.nextLine();
                     System.out.println("Enter id");
                      String id= input.nextLine();
                     System.out.println("Enter salary");
                    double salary=input.nextDouble();
                    employee[i]=new SalaryEmployee(name, id,salary);
                    break;
                
                     
                case 1:
                     System.out.println("Enter name");
                      String name1= input.nextLine();
                     System.out.println("Enter id");
                      String id1= input.nextLine();
                    System.out.println("Enter commission rate");
                    double commissionrate=input.nextDouble();
                    System.out.println("Enter sales");
                    double sales=input.nextDouble();
                    employee[i]=new CommissionEmployee(name1,id1,commissionrate,sales);
                    break;
                    
                 
                case 2:
                     System.out.println("Enter name");
            String name2= input.nextLine();
            System.out.println("Enter id");
            String id2= input.nextLine();
                    System.out.println("Enter Total hour worked");
                    double Totalhourworked=input.nextDouble();
                    System.out.println("Enter Per hour pay");
                    double Perhourpay=input.nextDouble();
                    employee[i]=new HourlyEmployee(name2,id2,Totalhourworked,Perhourpay);
                    break;
                    
                default:
                break;
                   
            }
            
             }
             double TotalEarnings=0;
             for(int i= 0;i<employee.length;i++){
                 System.out.println(employee[i]);
                 TotalEarnings +=employee[i].earnings();
                 
             }
             System.out.println("Total Earnings of employee is:  " + TotalEarnings);
            
    }
          }
     }
    