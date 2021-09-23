package designPattern.builder;

public class TextBuilder extends Builder{
    private StringBuffer buffer = new StringBuffer();
    @Override
    public void makeTitle(String title) {
        buffer.append("================¥n");
        buffer.append("{" + title + "¥n}");
        buffer.append("¥n");
    }

    public void makeString(String str) {                        // �ץ졼��ƥ����ȤǤ�ʸ����
        buffer.append('・' + str + "\n");                           // ���Ĥ���ʸ����
        buffer.append("\n");                                        // ����
    }
    public void makeItems(String[] items) {                     // �ץ졼��ƥ����ȤǤβվ��
        for (int i = 0; i < items.length; i++) {
            buffer.append("・" + items[i] + "\n");                // ���Ĥ��ι���
        }
        buffer.append("\n");                                        // ����
    }
    public void close() {                                       // ʸ��δ���
        buffer.append("==============================\n");          // ������
    }
    public String getResult() {                                 // ��������ʸ��
        return buffer.toString();                                   // StringBuffer��String���Ѵ�
    }
}
