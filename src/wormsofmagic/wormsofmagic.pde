void setup()
{
  size(1700, 1000);
  background( #B1FF0A);
}


int as1 = ;
int as2 = ;

void draw()
{
  makeMagical();

  for (int i =0; i<100; i++) {
    if (i==1) {
      float x =   map(noise(i*noiseInterval + frameCount * frequency), 0, 2, 0, (1700/3));
      float y = map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 2, 0, height);
      fill(#FFCA36);
      ellipse(x, y, 30, 30);
    }
    if (i==2) {
      float x =   map(noise(i*noiseInterval + frameCount * frequency), 0, 2, 0, (1700/3));
      float y = map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 2, 0, height);
      fill(#8606A0);
      ellipse(x, y, 25, 25);
    }
    if (i>2&&i<17) {
      float x =   map(noise(i*noiseInterval + frameCount * frequency), 0, 2, 0, (1700/3));
      float y = map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 2, 0, height);
      fill(#FC050D);
      ellipse(x, y, 10, 10);
    }
    if (i>17&&i<32) {
      float x =   map(noise(i*noiseInterval + frameCount * frequency), 0, 2, 0, (1700/3));
      float y = map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 2, 0, height);
      fill(#391B1B);
      ellipse(x, y, 20, 20);
    }
    if (i>32&&i<47) {
      float x =   map(noise(i*noiseInterval + frameCount * frequency), 0, 2, 0, (1700/3));
      float y = map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 2, 0, height);
      fill(#016F02);
      ellipse(x, y, 10, 10);
    }
    if (i==48) {
      float x =   map(noise(i*noiseInterval + frameCount * frequency), 0, 2, 0, (1700/3));
      float y = map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 2, 0, height);
      fill(#FC6500);
      ellipse(x, y, 15, 15);
    }

    fill(#FC00B1);
    ellipse(getWormX(i), getWormY(i), 10, 10);
  }
 //
 //
 //
 //
 //
 //
 //
 //
 //
 
  
  
  for (int i =0; i<101; i++) {
    if (i==1) {
      float x =   map(noise(i*noiseInterval + frameCount * frequency), 0, 2, 1700, 1700/3);
      float y = map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
      fill(#585356);
      ellipse(x, y, 30, 30);
    }
    if (i==2) {
      float x =   map(noise(i*noiseInterval + frameCount * frequency), 0, 2, 1700, 1700/3);
      float y = map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, 1000);
      fill(#5A0011);
      ellipse(x, y, 25, 25);
    }
    if (i>2&&i<42) {
      float x =   map(noise(i*noiseInterval + frameCount * frequency), 0, 2, 1700, 1700/3);
      float y = map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
      fill(#11F7F2);
      ellipse(x, y, 10, 10);
    }
    if (i>42&&i<72) {
      float x =   map(noise(i*noiseInterval + frameCount * frequency), 0, 2, 1700, 1700/3);
      float y = map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
      fill(#FCFFFF);
      ellipse(x, y, 20, 20);
    }
    if (i>72&&i<99) {
      float x =   map(noise(i*noiseInterval + frameCount * frequency), 0, 2, 1700, 1700/3);
      float y = map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
      fill(#000AFF);
      ellipse(x, y, 10, 10);
    }
    if (i==100) {
      float x =   map(noise(i*noiseInterval + frameCount * frequency), 0, 2, 1700, 1700/3);
      float y = map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
      fill(#FCD791);
      ellipse(x, y, 15, 15);
    }
     float x =   map(noise(i*noiseInterval + frameCount * frequency), 0, 2, 1700, 1700/3);
      float y = map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 2, 0, height);
    fill(#94FCB2);
    ellipse(x, y, 10, 10);
    
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
  return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, (1700/3));
}

float getWormY(int i) {
  return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}
