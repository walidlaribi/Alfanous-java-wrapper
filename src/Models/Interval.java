package Models;

public class Interval {
	public int start;
	public int total;
	public int end ;
	public int page;
	public int nb_pages;
	
	public Interval(int start, int total, int end, int page, int nb_page) {
		this.start = start;
		this.total = total;
		this.end = end;
		this.page = page;
		this.nb_pages = nb_page;
	}
	
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	public int getNbPages() {
		return nb_pages;
	}
	public void setNbPages(int nb_pages) {
		this.nb_pages = nb_pages;
	}
}
