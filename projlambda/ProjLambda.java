
package projlambda;

import java.util.function.Function;

class ProjLambda {

    
    public static void main(String[] args) {
        Comparator<Person> cmpAge=(p1,p2)->p2.age-p1.age;
        Comparator<Person> cmplname=(p1,p2)->p2.lname.compareTo(p1.lname);
        Comparator<Person> cmpfname=(p1,p2)->p2.fname.compareTo(p1.fname);
        
        Function<Person,Integer> f1=p->p.age;
        Function<Person,String> f2=p->p.lname;
        Function<Person,String> f3=p->p.fname;
        
        Comparator<Person> cmpPerson=Comparator.comparing(f1);//or we can the expression inside f1
        Person p1=new Person("Agrey ","Srivastava",22);
        Person p2=new Person("Prakhar ","Srivastava",22);
        System.out.println(cmpfname.compare(p1, p2));
        System.out.println(cmplname.compare(p1, p2));
        System.out.println((cmpAge.compare(p1, p2)==0)?"Ages are same":"Ages are not same");
    }
    
}
