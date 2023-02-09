package sample.icecream;

public class CU {

	public Object getIcecream(int left) {
		//(편의점 : 편의점(주인/점원))
		//누가바의 금액
		int price = 700;
		//6. 편의점 주인은 꼬마가 가져온 돈과 누가바의 금액을 비교한다.
		if (left >= price)//6-1누가바 보다 많은금액을 가져왔을때
		{
			left -= price;
			String icecream = "누가바, "+left;
			//7-1. 편의점 주인은 꼬마에게 오른손에 아이스크림과 잔돈을 준다(5번에 대한 답변).
			return icecream;
		}
		else if (left == 700)//6-2누가바와 같은 금액을 가져왔을때
		{
			String icecream = "누가바";
			//7-2. 편의점 주인은 꼬마에게 오른손에 아이스크림을 준다(5번에 대한 답변).
			return icecream;
		}
		else//6-3누가바 보다 적은금액을 가져왔을때
		{
			int need = 700 - price;
			//7-3. 편의점 주인은 꼬마에게 누가바의 가격과 추가로 필요한 금액을 말해준다.
			return "누가바는700원입니다"+need+"원이 더 필요합니다.";
		}
		
	}

}
