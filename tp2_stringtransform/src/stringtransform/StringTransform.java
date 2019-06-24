package stringtransform;

public class StringTransform {

    public String transform(String initial, String operation, String modificateur) {
        String result = "";
        if (operation.equals("concat")) {
            result = initial.concat(modificateur);
        }
        if (operation.equals("upper")) {
            result = initial.toUpperCase();
        }
        if (operation.equals("lower")) {
            result = initial.toLowerCase();
        }

        if (operation.equals("zip")) {
            if (initial.length() <= modificateur.length()) {

                for (int i = 0; i < initial.length(); i++) {
                    result = result + modificateur.charAt(i) + initial.charAt(i);
                   
                }
//            } else {
//                for (int i = 0; i < initial.length(); i++) {
//                    result = initial.substring(i, i++).concat(modificateur.substring(i, i++));
//                    result = result.concat(result);
//                }
//
//            }

        }
        
    }
        return result;
}
}
