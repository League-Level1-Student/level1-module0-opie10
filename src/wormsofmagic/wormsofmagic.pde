void setup()
{
  size(1700, 1000);
  background( #B1FF0A);
}


int as1 = 0;
int as1d = 0;
int as2 = 0;
int as2d = 0;
int d1= 1000;
int d2=10000;
void draw()
{
  makeMagical();

  for (int i =0; i<d1; i++) {
    if (i==1) {
      float x =   map(noise(i*noiseInterval + frameCount * frequency), 0, 2, as1, as1+(1700/3));
      float y = map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 2, 0, height);
      fill(#FFCA36);
      ellipse(x, y, 30, 30);
    }
    if (i==2) {
      float x =   map(noise(i*noiseInterval + frameCount * frequency), 0, 2, as1,as1 + (1700/3));
      float y = map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 2, 0, height);
      fill(#8606A0);
      ellipse(x, y, 25, 25);
    }
    if (i>2&&i<17) {
      float x =   map(noise(i*noiseInterval + frameCount * frequency), 0, 2, as1,as1 + (1700/3));
      float y = map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 2, 0, height);
      fill(#FC050D);
      ellipse(x, y, 10, 10);
    }
    if (i>17&&i<32) {
      float x =   map(noise(i*noiseInterval + frameCount * frequency), 0, 2, as1,as1 + (1700/3));
      float y = map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 2, 0, height);
      fill(#391B1B);
      ellipse(x, y, 20, 20);
    }
    if (i>32&&i<47) {
      float x =   map(noise(i*noiseInterval + frameCount * frequency), 0, 2, as1,as1 + (1700/3));
      float y = map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 2, 0, height);
      fill(#016F02);
      ellipse(x, y, 10, 10);
    }
    if (i==48) {
      float x =   map(noise(i*noiseInterval + frameCount * frequency), 0, 2, as1,as1 + (1700/3));
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
 if(as1d<(230000)){
  as1+=5 - ((int)random(9));
  as1d += as1;
 
 }
 if(as1d>230000){
   int randnum = (int)random(10);
   if(randnum% 10==0){
   d1-- ;
   
   }
   
 }
 if(as2d>(-129177)){
  as2-=5 - ((int)random(9));
  as2d += as2;
 println(as2d);
 
 }
 if(as2d<-129177){
   int randnum = (int)random(10);
   if(randnum% 2==0){
   d2-- ;
   
   }
   
 }
 
  for (int i =0; i<d2; i++) {
    if (i==1) {
      float x =   map(noise(i*noiseInterval + frameCount * frequency), 0, 2, as2+ 1700,as2 + 1700/3);
      float y = map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
      fill(#585356);
      ellipse(x, y, 30, 30);
    }
    if (i==2) {
      float x =   map(noise(i*noiseInterval + frameCount * frequency), 0, 2, as2 +1700,as2 + 1700/3);
      float y = map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, 1000);
      fill(#5A0011);
      ellipse(x, y, 25, 25);
    }
    if (i>2&&i<42) {
      float x =   map(noise(i*noiseInterval + frameCount * frequency), 0, 2, as2 +1700,as2 + 1700/3);
      float y = map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
      fill(#11F7F2);
      ellipse(x, y, 10, 10);
    }
    if (i>42&&i<72) {
      float x =   map(noise(i*noiseInterval + frameCount * frequency), 0, 2, as2 +1700,as2 + 1700/3);
      float y = map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
      fill(#FCFFFF);
      ellipse(x, y, 20, 20);
    }
    if (i>72&&i<99) {
      float x =   map(noise(i*noiseInterval + frameCount * frequency), 0, 2, as2 +1700,as2 + 1700/3);
      float y = map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
      fill(#000AFF);
      ellipse(x, y, 10, 10);
    }
    if (i==100) {
      float x =   map(noise(i*noiseInterval + frameCount * frequency), 0, 2, as2 +1700,as2 + 1700/3);
      float y = map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
      fill(#FCD791);
      ellipse(x, y, 15, 15);
    }
     float x =   map(noise(i*noiseInterval + frameCount * frequency), 0, 2, as2 +1700,as2 + 1700/3);
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
  return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, as1,as1+ (1700/3));
}

float getWormY(int i) {
  return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}
