package com.MO.MatterOverdrive.api.transport;

import com.MO.MatterOverdrive.data.TransportLocation;

import java.util.List;

/**
 * Created by Simeon on 5/5/2015.
 */
public interface ITransportList {
    List<TransportLocation> getPositions();
}
