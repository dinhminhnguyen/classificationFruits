public class ClassificationFruits {
    public String color;
    public double diameter;
    public ClassificationFruits() {

    }
    public ClassificationFruits(String color, double diameter ){
        this.color = color;
        this.diameter = diameter;
    }

    public String classification(String color, double diameter){
        if(color.equals("yellow")){
            if(diameter >= 7.0 && diameter <= 10.0){
                return "orange";
            }else if(diameter >= 4.0 && diameter < 6.0){
                return "lemon";
            }else
                return "invalid";
        }else if(color.equals("green")){
            if(diameter >= 3.5 && diameter < 7.0){
                return "orange";
            }else if(diameter >= 2.5 && diameter < 3.5){
                return "lemon";
            }else
                return "invalid";
        }else if (color.equals("yellow-green")){
            if(diameter > 6.0 && diameter <= 8.0){
                return "orange";
            }else if(diameter >= 3.0 && diameter < 6.0){
                return "lemon";
            }else
                return "invalid";
        }else
            return "invalid";
    }

}
