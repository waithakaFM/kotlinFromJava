class Meeting (val title: String){
    var location = ""

//    to make the property well adopted in java without the use of set nad get
    @JvmField
    var description = ""

    @Throws(MeetingException::class)
    fun addAttendee(attendee: String){
        if(attendee.isNullOrEmpty()) throw MeetingException("Attendee must have a name")
    }

//    static variable in kotlin is companion object
    companion object{
        @JvmField
        val APP_VERSION = 1

        @JvmStatic
        fun getAppVersion(): Int {
           return APP_VERSION
        }
    }
}

// consuming an exception from kotlin to java
class MeetingException(message: String) : Exception(message){

}