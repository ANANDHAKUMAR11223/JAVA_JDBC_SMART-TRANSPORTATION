package BUS1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class inventory {


int count;
//private static final int[] Bcolor = null;
//private static final String Bprice = null;
private List<buss> products;
private String busiddelete;
public inventory() {
this.products = new ArrayList<>();
    }
public void addProduct(buss product) {
//products.add(product);
	Statement stmt;
	ResultSet rs;
	String qry=null;
	dbutil db=new dbutil();
	Connection con;
	boolean sts=false;
	try
	{
		Connection con1=db.getDBConnection();
		stmt=con1.createStatement();
	     //qry=stmt.executeUpdate("insert into bdetail(Bname,Bprice,Bcolor)values('"+product.getBname()+"','"+product.getBprice()+"','"+product.getBcolor()+"')");
	    count=stmt.executeUpdate("insert into bdetail(Bname,Bprice,Bcolor)values('"+product.getBname()+"','"+product.getBprice()+"','"+product.getBcolor()+"')");
	    if(count==1)
	    	sts=true;
	    else
	    	throw new Exception();
		System.out.println("INSERTED SUCCESFULLY");
    }
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());
		//return sts;
	}
	//return sts;
}
public void updateProduct(buss product) {
/*if (index >= 0 && index <products.size()) {
products.set(index, updatedProduct);
        } else {
System.out.println("Invalid index. No product updated.");
        }
    }*/
	Statement stmt;
	ResultSet rs;
	String qry=null;
	dbutil db=new dbutil();
	boolean sts=false;
	try {
		Connection con=db.getDBConnection();
		con=db.getDBConnection();
		stmt=con.createStatement();
		int count = stmt.executeUpdate("UPDATE bdetail SET Bname='" + product.getBname() + "', Bprice=" + product.getBprice() + " WHERE id=" + product.getId());
		System.out.println("UPDATED SUCCESSFULLY");

	  }
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());
	}
}
public void removeProduct(int busiddelete) {
	Statement stmt;
	ResultSet rs;
	String qry=null;
	dbutil db=new dbutil();
	boolean sts=false;
	try
	{
		Connection con=db.getDBConnection();
		con=db.getDBConnection();
		stmt=con.createStatement();
		int count=stmt.executeUpdate("DELETE from bdetail WHERE id="+busiddelete);
		
	}
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());
	}
}
	
	
public buss findBname(String bname) {
for (buss product : products) {
if (product.getBname() == bname) {
return product;
            }
        }
return null; 
    }
public void showAllProducts()
{
	Statement stmt;
	ResultSet rs;
	String qry=null;
	dbutil db=new dbutil();
	Connection con;
	try
	{
		con=db.getDBConnection();
		stmt=con.createStatement();
		rs=stmt.executeQuery("select * from bdetail");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"    "+rs.getInt(3)+"    "+rs.getString(4)+"    ");
			
		}
	}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

public List<buss>getProducts() {
return products;
    }
public List<buss> getBrand() {
	// TODO Auto-generated method stub
	return null;
}
public buss getBname() {
	// TODO Auto-generated method stub
	return null;
}
}



