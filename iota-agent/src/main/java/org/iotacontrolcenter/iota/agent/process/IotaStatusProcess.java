package org.iotacontrolcenter.iota.agent.process;

import java.io.File;

public class IotaStatusProcess extends OsProcess {

    public IotaStatusProcess() {
        super("iotastatus");

        String checkScript = "checkiotastatus";
        checkScript += propSource.osIsWindows() ? ".bat" : ".bash";

        setArgs(new String[] { propSource.getIccrBinDir() + "/" + checkScript});

        setDir(new File(propSource.getIccrBinDir()));
    }
}
