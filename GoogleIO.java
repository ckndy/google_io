public class GoogleIO {

  private String name;
  private Attendee[] event;
  
  public GoogleIO(String name) {
    this.name = name;
    this.event = new Attendee[];
  }

  public String getName() {
    return this.name;
  }

  public int eventCount() {
    int count = 0;
    for (Attendee attendee : event) {
      if (attendee != null) {
        count++;
      }
    }
    return count;
  }

  // public void ?(Attendee attendee) {
  // if(eventFull()) return;
  // int eventCount = eventCount();
  // event[eventCount] = attendee;
  // }

  // public boolean eventFull() {
  //   return eventCount() >= event.length;
  // }

  // public void ?(){
  //    for(int i = 0; i < event.length; i++){
  //      event[i] = null;
}
}