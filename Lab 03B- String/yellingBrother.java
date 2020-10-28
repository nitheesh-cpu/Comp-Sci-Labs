public String yellingBrother( String message ) {
        String firstLetter = (message.substring(0,1));
        firstLetter = firstLetter.toUpperCase();
        message = message.substring(1);
        message = message.toLowerCase();
        message = message.replaceAll("!",".");
        return firstLetter + message;
    }
