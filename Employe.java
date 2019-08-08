

public class Employe {
	public int emp_id;
public String emp_name;
public   double emp_sal;

public Employe(int emp_id, String emp_name, double emp_sal) {
	
	this.emp_id = emp_id;
	this.emp_name = emp_name;
	this.emp_sal = emp_sal;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return("id="+emp_id+"\nname="+emp_name+"\nsalary="+emp_sal);
}

}
class Manager extends Employe{
public double bonus;
	
public Manager(int emp_id, String emp_name, double emp_sal, double bonus) {
	super(emp_id, emp_name, emp_sal);
	this.bonus = bonus;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return(super.toString()+"\nbonus="+bonus);
}


}














