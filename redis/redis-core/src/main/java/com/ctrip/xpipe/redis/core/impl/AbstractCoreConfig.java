package com.ctrip.xpipe.redis.core.impl;

import java.util.concurrent.atomic.AtomicReference;

import com.ctrip.xpipe.config.AbstractConfigBean;
import com.ctrip.xpipe.redis.core.CoreConfig;

/**
 * @author marsqing
 *
 *         Jun 16, 2016 12:08:01 PM
 */
public class AbstractCoreConfig extends AbstractConfigBean implements CoreConfig {
	
	public static String KEY_ZK_ADDRESS  = "zk.address";

	private AtomicReference<String> zkConnectionString = new AtomicReference<>();

	@Override
	public String getZkConnectionString() {
		
		return getProperty(KEY_ZK_ADDRESS, zkConnectionString.get());
	}

	public void setZkConnectionString(String zkConnectionString) {
		this.zkConnectionString.set(zkConnectionString);
	}

}
