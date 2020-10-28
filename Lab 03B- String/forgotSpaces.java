public String forgotSpaces( String str ) {
    return str.substring(0,str.indexOf('.') + 1) + " " + str.substring((str.indexOf(".") + 1),str.lastIndexOf('.')+1) + " " + str.substring(str.lastIndexOf(".") + 1);
}
