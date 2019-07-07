package raft.svrgroup.raft.common;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * 节点配置
 *
 * @author 莫那·鲁道
 */
@Getter
@Setter
@ToString
public class NodeConfig {

    /** 自身 selfPort */
    public int selfPort;

    /** 所有节点地址. */
    public List<String> peerAddrs;

}
