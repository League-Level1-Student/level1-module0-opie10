void setup()
{
  size(500, 500);
  background( #B1FF0A);
}




void draw()
{
  makeMagical();
  
  for (int i =0; i<299; i++) {
    if(i==1){
    fill(#FFCA36);
      ellipse(getWormX(i),getWormY(i), 10, 10);
    }
    fill(#19A5CE);
    ellipse(getWormX(i),getWormY(i), 10, 10);
 
}

}
float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
