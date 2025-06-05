package ex04;

// ToyPriceInfo 클래스는 장난감의 모델명과 가격 정보를 저장
class ToyPriceInfo{
	private String model;
	private int price;
	
	public ToyPriceInfo(String model, int price) {
		this.model = model;
		this.price = price;
	}

	// 생성자와 getter 메서드만 정의되어 있음 (getModel(), getPrice()).
	public String getModel() {
		return model;
	}

	public int getPrice() {
		return price;
	}
}