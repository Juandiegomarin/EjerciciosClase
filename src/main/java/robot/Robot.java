
package robot;


public record Robot(int numSerie,int vida)implements Comparable<Robot>{

    @Override
    public int compareTo(Robot o) {
        return Integer.compare(this.numSerie, o.numSerie);
    }

}
