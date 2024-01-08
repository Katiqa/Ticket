import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class AviaSoulsTest {
    @Test
    public void SearchTicketByPrice() {

        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 5500, 3, 8);//3
        Ticket ticket2 = new Ticket("MSK", "SPB", 5500, 15, 19);//4
        Ticket ticket3 = new Ticket("MSK", "SPB", 3700, 10, 15);//5
        Ticket ticket4 = new Ticket("SPAIN", "LA", 5000, 8, 12);//4
        Ticket ticket5 = new Ticket("NEW", "MEXICO", 4300, 11, 17);//6
        Ticket ticket6 = new Ticket("MSK", "SPB", 9000, 7, 8);//1
        Ticket ticket7 = new Ticket("MSK", "SPB", 1600, 5, 8);//3
        Ticket ticket8 = new Ticket("NEW", "LA", 2500, 9, 11);//2

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);


        Ticket[] actual = manager.search("MSK", "SPB");
        Ticket[] expected = {ticket7, ticket3, ticket1, ticket2, ticket6};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void SearchTicketByPriceOne() {

        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 5500, 3, 8);//3
        Ticket ticket2 = new Ticket("MSK", "SPB", 6200, 15, 19);//4
        Ticket ticket3 = new Ticket("MSK", "SPB", 3700, 10, 15);//5
        Ticket ticket4 = new Ticket("SPAIN", "LA", 5000, 8, 12);//4
        Ticket ticket5 = new Ticket("NEW", "MEXICO", 4300, 11, 17);//6
        Ticket ticket6 = new Ticket("MSK", "SPB", 9000, 7, 8);//1
        Ticket ticket7 = new Ticket("MSK", "SPB", 1600, 5, 8);//3
        Ticket ticket8 = new Ticket("NEW", "LA", 2500, 9, 11);//2

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);


        Ticket[] actual = manager.search("SPAIN", "LA");
        Ticket[] expected = {ticket4};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void SearchTicketByPriceZero() {

        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 5500, 3, 8);//3
        Ticket ticket2 = new Ticket("MSK", "SPB", 6200, 15, 19);//4
        Ticket ticket3 = new Ticket("MSK", "SPB", 3700, 10, 15);//5
        Ticket ticket4 = new Ticket("SPAIN", "LA", 5000, 8, 12);//4
        Ticket ticket5 = new Ticket("NEW", "MEXICO", 4300, 11, 17);//6
        Ticket ticket6 = new Ticket("MSK", "SPB", 9000, 7, 8);//1
        Ticket ticket7 = new Ticket("MSK", "SPB", 1600, 5, 8);//3
        Ticket ticket8 = new Ticket("NEW", "LA", 2500, 9, 11);//2

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);


        Ticket[] actual = manager.search("MSK", "NEW");
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void SearchTicketByTimeZero() {

        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 5500, 3, 8);//3
        Ticket ticket2 = new Ticket("MSK", "SPB", 6200, 15, 19);//4
        Ticket ticket3 = new Ticket("MSK", "SPB", 3700, 10, 15);//5
        Ticket ticket4 = new Ticket("SPAIN", "LA", 5000, 8, 12);//4
        Ticket ticket5 = new Ticket("NEW", "MEXICO", 4300, 11, 17);//6
        Ticket ticket6 = new Ticket("MSK", "SPB", 9000, 7, 8);//1
        Ticket ticket7 = new Ticket("MSK", "SPB", 1600, 5, 8);//3
        Ticket ticket8 = new Ticket("NEW", "LA", 2500, 9, 11);//2

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Comparator<Ticket> comparator = new TicketTimeComparator();


        Ticket[] actual = manager.searchAndSortBy("MSK", "NEW", comparator);
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void SearchTicketByTimeOne() {

        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 5500, 3, 8);//3
        Ticket ticket2 = new Ticket("MSK", "SPB", 6200, 15, 19);//4
        Ticket ticket3 = new Ticket("MSK", "SPB", 3700, 10, 15);//5
        Ticket ticket4 = new Ticket("SPAIN", "LA", 5000, 8, 12);//4
        Ticket ticket5 = new Ticket("NEW", "MEXICO", 4300, 11, 17);//6
        Ticket ticket6 = new Ticket("MSK", "SPB", 9000, 7, 8);//1
        Ticket ticket7 = new Ticket("MSK", "SPB", 1600, 5, 8);//3
        Ticket ticket8 = new Ticket("NEW", "LA", 2500, 9, 11);//2

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Comparator<Ticket> comparator = new TicketTimeComparator();


        Ticket[] actual = manager.searchAndSortBy("NEW", "LA", comparator);
        Ticket[] expected = {ticket8};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void SearchTicketByTime() {

        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 5500, 3, 6);//3
        Ticket ticket2 = new Ticket("MSK", "SPB", 6200, 15, 19);//4
        Ticket ticket3 = new Ticket("MSK", "SPB", 3700, 10, 15);//5
        Ticket ticket4 = new Ticket("SPAIN", "LA", 5000, 8, 12);
        Ticket ticket5 = new Ticket("NEW", "MEXICO", 4300, 11, 17);
        Ticket ticket6 = new Ticket("MSK", "SPB", 9000, 7, 8);//1
        Ticket ticket7 = new Ticket("MSK", "SPB", 1600, 5, 8);//3
        Ticket ticket8 = new Ticket("NEW", "LA", 2500, 9, 11);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Comparator<Ticket> comparator = new TicketTimeComparator();


        Ticket[] actual = manager.searchAndSortBy("MSK", "SPB", comparator);
        Ticket[] expected = {ticket6, ticket1, ticket7, ticket2, ticket3};

        Assertions.assertArrayEquals(expected, actual);
    }

}
