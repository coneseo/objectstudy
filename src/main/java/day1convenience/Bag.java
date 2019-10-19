package day1convenience;

import java.util.List;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;
import sun.util.resources.cldr.shi.CalendarData_shi_Latn_MA;

@Getter
@Setter
public class Bag {
  private Map<Product, Integer> products;
  private Wallet wallet;
}
