package service;

import Model.Jumper;

import java.util.ArrayList;
import java.util.List;

public class JumperServiceImpl implements JumperService{
    Jumper jumper;
    List<Jumper> jumpers;
    @Override
    public Jumper addJumper(int startLocation, int endLocation) {
            jumper=new Jumper();
            jumpers=new ArrayList<>();
            jumper.setEndLocation(endLocation);
            jumper.setStartLocation(startLocation);
            jumpers.add(jumper);
            return jumper;
    }
}
