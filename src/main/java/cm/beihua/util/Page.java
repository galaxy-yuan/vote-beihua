package cm.beihua.util;

import java.util.List;

public class Page<T> {

   private int pageSize;
   
   private int pageNum;
   
   private int total;
   
   private int pageCount;
   
   public int getPageSize() {
	return pageSize;
}

public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
}

public int getPageCount() {
	return pageCount;
}

public void setPageCount(int pageCount) {
	this.pageCount = pageCount;
}

private List<T>  list;

public int getpageSize() {
	return pageSize;
}

public void setpageSize(int pageSize) {
	this.pageSize = pageSize;
}

public int getPageNum() {
	return pageNum;
}

public void setPageNum(int pageNum) {
	this.pageNum = pageNum;
}

public int getTotal() {
	return total;
}

public void setTotal(int total) {
	this.total = total;
}

public List<T> getList() {
	return list;
}

public void setList(List<T> list) {
	this.list = list;
}
public Page(int total,int pageSize,int pageNum,List<T> list){
	this.total=total;
	this.pageSize=pageSize;
	this.list=list;
	this.pageNum=pageNum;
	if(total%pageSize==0){
		this.pageCount=total/pageSize;
	}else{
		this.pageCount = (total/pageSize)+1;
	}
}
@Override
public String toString() {
	return "Page [pageSize=" + pageSize + ", pageNum=" + pageNum + ", total="
			+ total + ", pageCount=" + pageCount + ", list=" + list + "]";
}
	
	
	
}
