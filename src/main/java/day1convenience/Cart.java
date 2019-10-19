package day1convenience;

import java.util.Map;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cart {

  private Map<Product, Integer> products;
  private int totalPrice = 0;

  public int calculate(){
    for(Map.Entry<Product, Integer> map : products.entrySet()){
      Product key = map.getKey();
      Integer value = map.getValue();
      totalPrice += key.getPrice() * value;
    }
    return totalPrice;
  }
}
