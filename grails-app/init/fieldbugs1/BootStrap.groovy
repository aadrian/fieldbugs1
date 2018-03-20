package fieldbugs1

import com.mycorp.fieldbugs1.TableOne
import com.mycorp.fieldbugs1.TableTwo

class BootStrap {

    def init = { servletContext ->
        // add some initial demo data
        TableOne t1_1 = new TableOne(strName: 't1_1',intgNo: 42, strWorking: 'y', dtFirst: new Date()).save(failOnError:true)
        TableOne t1_2 = new TableOne(strName: 't1_2',intgNo: 22, strWorking: 'n', dtFirst: new Date()).save(failOnError:true)
        TableOne t1_3 = new TableOne(strName: 't1_3',intgNo: 44, strWorking: 'y', dtFirst: new Date()).save(failOnError:true)
        TableOne t1_4 = new TableOne(strName: 't1_4',intgNo: 66, strWorking: 'n', dtFirst: new Date()).save(failOnError:true)
        TableOne t1_5 = new TableOne(strName: 't1_5',intgNo: 42, strWorking: 'n', dtFirst: new Date()).save(failOnError:true)


        TableTwo t2_1 = new TableTwo(strName: 't2_1', intgNo: 22).save(failOnError:true)
        TableTwo t2_2 = new TableTwo(strName: 't2_2', intgNo: 42).save(failOnError:true)
        TableTwo t2_3 = new TableTwo(strName: 't2_3', intgNo: 22).save(failOnError:true)
        TableTwo t2_4 = new TableTwo(strName: 't2_4', intgNo: 42).save(failOnError:true)
        TableTwo t2_5 = new TableTwo(strName: 't2_5', intgNo: 22).save(failOnError:true)
        TableTwo t2_6 = new TableTwo(strName: 't2_6', intgNo: 42).save(failOnError:true)
        TableTwo t2_7 = new TableTwo(strName: 't2_7', intgNo: 22).save(failOnError:true)
    }
    def destroy = {
    }
}
