package com.SSM.controller.test;

public interface Play extends Higher{
                     public void playing();
                    @Override
                    default void higher() {
                               System.out.println("high!");                    		
                    }
}
