package me.nz.projects.voxic.controllers;

import javax.sound.midi.*;

public class MidiController implements Receiver {

//    private static final List<MidiDevice> inputs;
//    private static final List<MidiDevice> outputs;
//
//    {
//        for (MidiDevice.Info info : MidiSystem.getMidiDeviceInfo()) {
//            MidiDevice device = null;
//            Transmitter transmitter;
//            try {
//                device = MidiSystem.getMidiDevice(info);
//                transmitter = device.getTransmitter();
//            } catch (MidiUnavailableException e) {
//                e.printStackTrace();
//            }
//            System.out.println(info.getVendor());
//            System.out.println(info.getName());
//            System.out.println(info.getDescription());
//            System.out.println(info.getVersion());
//        }
//    }


    @Override
    public void send(MidiMessage message, long timeStamp) {

    }

    @Override
    public void close() {

    }

    public static void main(String[] args) {
    }
}
