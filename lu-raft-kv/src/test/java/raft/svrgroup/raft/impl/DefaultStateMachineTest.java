package raft.svrgroup.raft.impl;

import raft.svrgroup.raft.entity.LogEntry;
import org.junit.Before;
import org.junit.Test;
import org.rocksdb.RocksDBException;

import raft.svrgroup.raft.entity.Command;

/**
 *
 * @author 莫那·鲁道
 */
public class DefaultStateMachineTest {

    static {
        System.setProperty("serverPort", "8777");
        DefaultStateMachine.dbDir = "/Users/ericens/tmp/lu-raft-revert/rocksDB-raft/" + System.getProperty("serverPort");
        DefaultStateMachine.stateMachineDir = DefaultStateMachine.dbDir + "/stateMachine";
    }
    DefaultStateMachine machine;

    @Before
    public void before() {
        machine = DefaultStateMachine.getInstance();

    }

    @Test
    public void apply() {
        LogEntry logEntry = LogEntry.newBuilder().term(1).command(Command.newBuilder().key("hello").value("value1").build()).build();
        machine.apply(logEntry);
    }


    @Test
    public void applyRead() throws RocksDBException {

        System.out.println(machine.get("hello:7"));
    }
}