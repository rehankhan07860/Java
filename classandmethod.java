public class classandmethod {

static class employee{
    int salary;
    String name;

    public int getSalary(){
        return  salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
    public static void main(String[] args) {
     employee rehan = new employee();
     rehan.setName("REhan khan is a good student");
     rehan.salary=10000;
        System.out.println(rehan.salary);
        System.out.println(rehan.getName());
    }
}
