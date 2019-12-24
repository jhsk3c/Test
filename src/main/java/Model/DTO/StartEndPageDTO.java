package Model.DTO;

public class StartEndPageDTO { //페이징을 위한 DTO예요!!

	Long startRow;
	Long endRow;
	Integer su1;
	
	public StartEndPageDTO(Long startRow, Long endRow) {
		super();
		this.startRow = startRow;
		this.endRow = endRow;

	}
	
	public StartEndPageDTO(Long startRow, Long endRow, Integer su1) {
		super();
		this.startRow = startRow;
		this.endRow = endRow;
		this.su1 = su1;
	}
	public Long getStartRow() {
		return startRow;
	}
	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}
	public Long getEndRow() {
		return endRow;
	}
	public void setEndRow(Long endRow) {
		this.endRow = endRow;
	}
	
	public Integer getSu1() {
		return su1;
	}
	public void setSu1(Integer su1) {
		this.su1 = su1;
	}
	
}
