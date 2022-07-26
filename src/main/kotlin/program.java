public class program {
    public static void main(String[] args) {
//        Working with a class defined in kotlin
        Meeting board = new Meeting("Board meeting");

//        access property
        board.setLocation("London");

        System.out.println("The meeting is in "+board.getLocation());

//         getting property without using setters
        board.description = "A board meeting";

//        use a companion object in java class from kotlin as static object
        int version = Meeting.APP_VERSION;

        Meeting.getAppVersion();

//        error exception
        try {
            board.addAttendee("");
        } catch (MeetingException e){
            e.printStackTrace();
        }

    }
}

