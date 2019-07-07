package raft.svrgroup.raft;

import raft.svrgroup.raft.entity.LogEntry;

/**
 *
 * @see LogEntry
 * @author 莫那·鲁道
 */
public interface LogModule {

    void write(LogEntry logEntry);

    LogEntry read(Long index);

    void removeOnStartIndex(Long startIndex);

    LogEntry getLast();

    Long getLastIndex();
}
