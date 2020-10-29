public class LogMessage {
    private String machineId;
    private String description;
    public LogMessage( String message ) {
        int colonIndex = message.indexOf(":");
        machineId = message.substring(0, colonIndex);
        description = message.substring(colonIndex + 1);
    }
    public boolean containsWord( String keyword ) {
        return (" " + description + " ").contains(" " + keyword + " ");
    }
    public String getMachineId() {
        return machineId;
    }
    public String getDescription() {
        return description;
    }
}
