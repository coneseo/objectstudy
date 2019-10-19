package day1convenience;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Partimer {
  int sell(Cart cart, int cash){
    int totalPrice = cart.calculate();
    //todo 물건이 팔리면 재고를 떨구고 금고를 채우고 거스름돈을 돌려주는 로직 추가
    return totalPrice;
  }
}
