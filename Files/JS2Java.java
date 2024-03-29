public final class JS2Java {
    private static int iterations = 0;

    public static void main(String[] args) {
        startMandelbulb();
        System.out.println(num + "!: " + rFact(5));
        System.out.println("Iterations: " + iterations);
    }

    public static double startMandelbulb(int x) {
        String mandelbulbCanvas = document.getElementById('mandelbulb')
        cHeight = mandelbulbCanvas.height;
        cWidth = mandelbulbCanvas.width;
        context = mandelbulbCanvas.getContext("2d");
        context.fillRect(0, 0, cWidth, cHeight);
        pixel = (DEPTH_OF_FIELD) / ((cHeight + cWidth) / 2);
        halfPixel = pixel / 2;
        image = context.getImageData(0, 0, cWidth, cHeight);
        imageData = image.data;
        x = x + pixel;
        animate();
        return x;
    }

    public static int rFact(int num) {
        iterations++;
        if (num == 0) {
            return 1;
        } else {
            return num * rFact(num - 1);
        }
    }
}
