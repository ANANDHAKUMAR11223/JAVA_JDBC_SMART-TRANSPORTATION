package BUS1;

public class buss {
	int Id;
	String Bname;
	int Bprice;
	String Bcolor;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		this.Bname = bname;
	}
	public int getBprice() {
		return Bprice;
	}
	public void setBprice(int bprice) {
		this.Bprice = bprice;
	}
	public String getBcolor() {
		return Bcolor;
	}
	public void setBcolor(String bcolor) {
		this.Bcolor = bcolor;
	}
	@Override
	public String toString() {
		return "buss [Id=" + Id + ", Bname=" + Bname + ", Bprice=" + Bprice + ", Bcolor=" + Bcolor + "]";
	}

}



