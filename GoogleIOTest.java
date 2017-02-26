import static org.junit.Assert.asserEquals;
import org.junit.*;

public class GoogleIOTest {
  GoogleIO googleio;
  Attendee attendee;


  @Before
  public void before() {
    googleio = new GoogleIO("Google IO 2017");
    attendee = new Attendee("Chris");
  }

  @Test
  public void hasName() {
    asserEquals("Google IO 2017", googleio.getName());
  }

  @Test 
  public void EventEmpty() {
    asserEquals(0, googleio.eventCount());
  }

  @Test
  public void addAttendee() {
    googleio.add(attendee);
    asserEquals(1, googleio.eventCount());
  }

  // @Test
  // public void EventFull() {
  //   for (int i = 0; i<7000; i++) {
  //     googleio.add(attendee);
  //   }
  // asserEquals(googleio.eventFull(), true);
  }
}